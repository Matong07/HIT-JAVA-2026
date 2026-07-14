import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new LinkedHashMap<>();
        addEdge(graph, "A", "B", 1);
        addEdge(graph, "A", "C", 4);
        addEdge(graph, "B", "C", 2);
        addEdge(graph, "B", "D", 5);
        addEdge(graph, "B", "E", 2);
        addEdge(graph, "C", "E", 1);
        addEdge(graph, "C", "F", 3);
        addEdge(graph, "D", "F", 6);
        addEdge(graph, "E", "F", 2);

        Map<String, Integer> heuristic = new LinkedHashMap<>();
        heuristic.put("A", 5);
        heuristic.put("B", 4);
        heuristic.put("C", 2);
        heuristic.put("D", 6);
        heuristic.put("E", 1);
        heuristic.put("F", 0);

        String start = "A";
        String goal = "F";

        Map<String, Integer> gScore = new LinkedHashMap<>();
        Map<String, Integer> fScore = new LinkedHashMap<>();
        Map<String, String> parent = new LinkedHashMap<>();
        Set<String> closed = new LinkedHashSet<>();
        List<String> open = new ArrayList<>();

        gScore.put(start, 0);
        fScore.put(start, heuristic.get(start));
        open.add(start);

        System.out.println("A* search from " + start + " to " + goal);
        System.out.println("----------------------------------------");
        int step = 0;

        while (!open.isEmpty()) {
            open.sort((n1, n2) -> {
                int compareF = Integer.compare(
                        fScore.getOrDefault(n1, Integer.MAX_VALUE),
                        fScore.getOrDefault(n2, Integer.MAX_VALUE)
                );
                if (compareF != 0) {
                    return compareF;
                }
                int compareH = Integer.compare(heuristic.get(n1), heuristic.get(n2));
                if (compareH != 0) {
                    return compareH;
                }
                return Integer.compare(gScore.getOrDefault(n1, Integer.MAX_VALUE), gScore.getOrDefault(n2, Integer.MAX_VALUE));
            });

            String current = open.remove(0);
            if (closed.contains(current)) {
                continue;
            }
            closed.add(current);
            step++;

            System.out.println("Step " + step + ": expand " + current);
            System.out.println("  g(" + current + ") = " + gScore.get(current));
            System.out.println("  h(" + current + ") = " + heuristic.get(current));
            System.out.println("  f(" + current + ") = " + fScore.get(current));

            if (current.equals(goal)) {
                break;
            }

            for (Map.Entry<String, Integer> edge : graph.getOrDefault(current, Collections.emptyMap()).entrySet()) {
                String neighbor = edge.getKey();
                int cost = edge.getValue();
                if (closed.contains(neighbor)) {
                    continue;
                }

                int tentativeG = gScore.get(current) + cost;
                if (!gScore.containsKey(neighbor) || tentativeG < gScore.get(neighbor)) {
                    gScore.put(neighbor, tentativeG);
                    parent.put(neighbor, current);
                    fScore.put(neighbor, tentativeG + heuristic.get(neighbor));
                    if (!open.contains(neighbor)) {
                        open.add(neighbor);
                    }
                }
            }

            System.out.println("  OPEN = " + formatState(open, gScore, fScore, heuristic));
            System.out.println("  CLOSED = " + closed);
        }

        if (!closed.contains(goal)) {
            System.out.println("No path found.");
            return;
        }

        List<String> path = new ArrayList<>();
        String cursor = goal;
        while (cursor != null) {
            path.add(cursor);
            cursor = parent.get(cursor);
        }
        Collections.reverse(path);

        System.out.println("----------------------------------------");
        System.out.println("Shortest path: " + path);
        System.out.println("Total cost: " + gScore.get(goal));
    }

    private static void addEdge(Map<String, Map<String, Integer>> graph, String from, String to, int cost) {
        graph.computeIfAbsent(from, ignored -> new LinkedHashMap<>()).put(to, cost);
        graph.computeIfAbsent(to, ignored -> new LinkedHashMap<>()).put(from, cost);
    }

    private static String formatState(List<String> open, Map<String, Integer> gScore, Map<String, Integer> fScore, Map<String, Integer> heuristic) {
        List<String> formatted = new ArrayList<>();
        for (String node : open) {
            formatted.add(node + "(g=" + gScore.get(node) + ",h=" + heuristic.get(node) + ",f=" + fScore.get(node) + ")");
        }
        return formatted.toString();
    }
}
