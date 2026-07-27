package Bai5;
public class DayNui {
    private int[] arr;

    public DayNui(int[] mảngĐầuVào) {
        this.arr = mảngĐầuVào;
    }

    public int demSoDinhNui() {
        int soLuongDinhNui = 0;
        int diemTrai = 0;
        int diemGiua = 0;
        int soPhanTuDaDuyet = 0; 

        for (int diemPhai : arr) {
            soPhanTuDaDuyet++; 

            if (soPhanTuDaDuyet >= 3) {
                if (diemGiua > diemTrai && diemGiua > diemPhai) {
                    soLuongDinhNui++;
                }
            }
            diemTrai = diemGiua; 
            diemGiua = diemPhai; 
        }
        
        return soLuongDinhNui;
    }
}
