package veriyapıları2;

public class VeriYapıları2 {
}
//21 ekim: ekleme , silme ve listeme işlemleri yapıldı ,jframe yapıldı.

class öğrenci {

    öğrenci ileri, ilk, son;
    int no;
    String isim;
    int ortayaEkle;

    public öğrenci(veriyapıları2.öğrenci ileri, int no, String isim) {
        ileri = null;
        this.no = no;
        this.isim = isim;
    }

    öğrenci() {
        ilk = null;
        son = null;
    }

    void başaEkle(int eleman1, String eleman2) {
        öğrenci ekle = new öğrenci();
        ekle.isim = eleman2;
        ekle.no = eleman1;
        if (ilk == null) {
            ilk = ekle;
            son = ekle;
        } else {
            ekle.ileri = ilk;
            ilk = ekle;
        }
    }

    int öğrenciSayısı() {
        int sayaç = 0;
        öğrenci temp;
        temp = ilk;
        while (temp != null) {
            temp = temp.ileri;
            sayaç++;
        }

        return sayaç;
    }

    void ortayaEkle(int eleman1, String eleman2, int ortayaEkle) {

        öğrenci ekle = new öğrenci();
        ekle.isim = eleman2;
        ekle.no = eleman1;
        int j = 1;
        int say = öğrenciSayısı();
        öğrenci geçici = ilk;
        this.ortayaEkle = ortayaEkle;

        if (ortayaEkle <= öğrenciSayısı()) {
            while (geçici != null) {
                if (ortayaEkle == j) {
                    ekle.ileri = geçici.ileri;
                    geçici.ileri = ekle;
                }
                geçici = geçici.ileri;
                j++;
            }

        } else {
            System.out.println("araya ekleme yapamazssın");
        }
    }

    void sonaEkle(int eleman1, String eleman2) {
        öğrenci ekle = new öğrenci();
        ekle.isim = eleman2;
        ekle.no = eleman1;
        if (son == null) {
            son = ekle;
            ileri = ekle;
        } else {
            son.ileri = ekle;
            son = ekle;
        }
    }

    öğrenci baştaSil() {
        öğrenci silinen= ilk;
        ilk= ilk.ileri;
        öğrenci öğr = new öğrenci();
        öğr = ilk;

        if (ilk == null) {
            son = null;
            ilk = null;
        } else {
            ilk = ilk.ileri;
        }
        return silinen;
    }

    void sondanSil() {
        öğrenci öğr = ilk;
        öğrenci önce = null;
        while (öğr != son) {
            önce = öğr;
            öğr = öğr.ileri;
        }
        if (öğr == null) {
            ilk = null;
            son = null;
        } else {
            önce.ileri = null;
            son = önce;
        }
    }

    void listele() {
        öğrenci öğrenci;
        öğrenci = ilk;
        while (öğrenci != null) {
            System.out.println("numarası -->" + öğrenci.no + "  ismi-->" + öğrenci.isim);
            öğrenci = öğrenci.ileri;

        }
    }

    void sırala() {
       
        
        
            }

        }
    


