public class Main {
    public static void main(String[] args) {

        TokoBuah buah = new TokoBuah();
        buah.nama = "Mangga";
        buah.harga = 8000;
        buah.rasa = "Manis dan Asam";

        TokoBuah buah1 = new TokoBuah();
        buah1.nama = "Jeruk";
        buah1.harga = 4000;
        buah1.rasa = "Manis Asem-asem";

        TokoBuah buah2 = new TokoBuah();
        buah2.nama = "Apel";
        buah2.harga = 5000;
        buah2.rasa = "Manis Kecut";

        TokoBuah buah3 = new TokoBuah();
        buah3.nama = "Pisang";
        buah3.harga = 5000;
        buah3.rasa = "Manis";

        System.out.println("List Harga Buah");
        buah.list();
        buah1.list();
        buah2.list();
        buah3.list();

    }
}