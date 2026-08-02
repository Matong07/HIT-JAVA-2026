package test2;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		// Đồ nội thất
		Furniture[] listFurniture = new Furniture[5];
		listFurniture = Furniture.generateFuniture(listFurniture.length);
		System.out.println("Da sinh ngau nhien 5 san pham do noi that\n");

		// Gạch ốp lát
		Ceramic_Tile[] listCeramicTile = new Ceramic_Tile[5];
		listCeramicTile = Ceramic_Tile.generateCeramicTile(5);
		System.out.println("Da sinh ngau nhien 5 san pham gach op lat");

		System.out.println("=====================================================================================");
		Scanner sc = new Scanner(System.in);
		int i = -1;
		do {

			do {
				System.out.println(
						"=====================================================================================");
				System.out.println("Nhap lua chon:\n- 1: Do gia dung\n- 2: Gach op lat\n- 0: Thoat chuong trinh");
				i = sc.nextInt();
			} while (i < 0 && i > 2);

			if (i == 1) {
				System.out.println(
						"Nhap lua chon:\n- 1: Danh sach san pham\n- 2: So san pham\n- 3: Tim kiem\n- 4: Cap nhat 1 san pham\n- 5: Xoa 1 san pham\n- 6: Sap xep theo ten\n- 7: sap xep theo nha san xuat\n- 8: Sap xep theo gia\n- 9: Gia tien\n- 0: Quay lai");
				i = sc.nextInt();
				switch (i) {
				case 1:
					Furniture.printFurniture(listFurniture);
					break;
				case 2:
					int c = 0;
					for (int j = 0; j < listFurniture.length; j++) {
						if (listFurniture[j] != null)
							c++;
						else
							break;
					}
					System.out.println("So san pham: " + c);
					break;
				case 3:
					Furniture.searchByFurnitureName(listFurniture);
					break;
				case 4:
					Furniture.updateFurniture(listFurniture);
					break;
				case 5:
					Furniture.deleteFurniture(listFurniture);
					break;
				case 6:
					Furniture.sortByFurnitureName(listFurniture);
					break;
				case 7:
					Furniture.sortByFurnitureManufacturer(listFurniture);
					break;
				case 8:
					Furniture.sortByFurniturePrice(listFurniture);
					break;
				case 9:
					for (int a = 0; a < listFurniture.length; a++) {
						listFurniture[a].calculatePrice();
					}
					break;
				case 0:
					i = -1;
					break;
				default:
					System.out.println("Khong hop le");
				}
			} else if (i == 2) {
				System.out.println(
						"Nhap lua chon:\n- 1: Danh sach san pham\n- 2: So san ph1am\n- 3: Tim kiem\n- 4: Cap nhat 1 san pham\n- 5: Xoa 1 san pham\n- 6: Sap xep theo ten\n- 7: sap xep theo nha san xuat\n- 8: Sap xep theo gia\n- 9: Gia tien san pham\n- 0: Quay lai");
				i = sc.nextInt();
				switch (i) {
				case 1:
					Ceramic_Tile.printCeramicTile(listCeramicTile);
					break;
				case 2:
					int c = 0;
					for (int j = 0; j < listCeramicTile.length; j++) {
						if (listCeramicTile[j] != null)
							c++;
						else
							break;
					}
					System.out.println("So san pham: " + c);
					break;
				case 3:
					Ceramic_Tile.searchByCeremicTileName(listCeramicTile);
					;
					break;
				case 4:
					Ceramic_Tile.updateCeramicTile(listCeramicTile);
					break;
				case 5:
					Ceramic_Tile.deleteCeramicTile(listCeramicTile);
					break;
				case 6:
					Ceramic_Tile.sortByCeramicTileName(listCeramicTile);
					break;
				case 7:
					Ceramic_Tile.sortByCeramicTileManufacturer(listCeramicTile);
					break;
				case 8:
					Ceramic_Tile.sortByCeramicTilePrice(listCeramicTile);
					break;
				case 9:
					for (int a = 0; a < listCeramicTile.length; a++) {
						listCeramicTile[a].calculatePrice();
					}
					break;
				case 0:
					i = -1;
					break;
				default:
					System.out.println("Khong hop le");
				}
			}
		} while (i != 0);

		// Furniture.searchByFurnitureName(listFurniture);
		// Ceramic_Tile.searchByCeremicTileName(listCeramicTile);

		// Ceramic_Tile.updateCeramicTile(listCeramicTile, n);
		// Ceramic_Tile.deleteCaremicTile(listCeramicTile, n);
	}
}
