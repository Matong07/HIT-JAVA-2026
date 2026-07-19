
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thong tin nhan vien: ");
        String input = sc.nextLine();

        String raw = input.trim();
        String[] parts = raw.split("-");

        if (parts.length >= 4) {
            String maSo = parts[0].trim();
            String hoTen = parts[1].trim();
            String namSinh = parts[2].trim();
            String phongBan = parts[3].trim();

            String[] words = hoTen.split("\\s+");
            StringBuilder normalizedName = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                if (words[i].isEmpty()) {
                    continue;
                }

                String word = words[i].toLowerCase();
                if (normalizedName.length() > 0) {
                    normalizedName.append(" ");
                }
                normalizedName.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1));
            }

            String departmentLower = phongBan.toLowerCase();
            if (departmentLower.contains("ky thuat") || departmentLower.contains("ky thuat")) {
                System.out.println("Phan loai: Nhan vien ky thuat");
            } else {
                System.out.println("Phan loai: Nhan vien nghiep vu");
            }

            int age = 2026 - Integer.parseInt(namSinh);
            System.out.printf(
                    "Ma nhan vien: %s | Ho va ten: %s | Tuoi: %d |Bo phan: %s%n",
                    maSo.toUpperCase(),
                    normalizedName.toString(),
                    age,
                    phongBan
            );
        }
    }
}
