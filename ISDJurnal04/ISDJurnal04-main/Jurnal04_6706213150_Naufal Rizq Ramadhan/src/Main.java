import java.util.Scanner;
import java.util.ListIterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[]args){
        LinkedList<listMusic>listMusic = new LinkedList<listMusic>();
        Scanner s = new Scanner(System.in);
        String judulLagu;
        String penyanyi;
        int pilihan = 0;

        while (pilihan !=4){
            System.out.println("Pilih menu berikut :");
            System.out.println("1. Tambah lagu");
            System.out.println("2. Hapus lagu");
            System.out.println("3. Play lagu");
            System.out.println("4. Keluar");
            ListIterator<listMusic>iterator = listMusic.listIterator();
            pilihan = s.nextInt();

            if(pilihan ==1){
                System.out.println("Masukkan judul dan nama penyanyi :");
                judulLagu = s.next();
                penyanyi = s.next();
                listMusic.add(new listMusic(judulLagu,penyanyi));
                System.out.println("Success menambahkan lagu");
            }

            else if(pilihan ==2){
                System.out.println("Opsi hapus?");
                System.out.println("1. Hapus lagu berdasarkan urutan");
                System.out.println("2. Hapus lagu berdasarkan judul");
                System.out.println("3. Back");
                int pilihRemove = s.nextInt();
                while (pilihRemove !=3){
                    if (pilihRemove == 1){
                        listMusic.removeLast();
                        System.out.println("Success menghapus lagu dari list");
                        break;
                    }
                    else if(pilihRemove == 2){
                        ListIterator<listMusic> iter = listMusic.listIterator();
                        System.out.println("Masukkan judul yang akan dihapus");
                        String judul = s.next();
                        while(iter.hasNext()){
                            listMusic lagu = iter.next();
                            if(lagu.judul().equals(judul)){
                                iter.remove();
                            }
                        }
                        System.out.println("Success menghapus lagu dari list");
                        break;
                    }
                    if(pilihRemove==3){
                        break;
                    }
                }
            }
            else if(pilihan==3){
                System.out.println("Memainkan lagu");

                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                System.out.println("====================");
                while (iterator.hasPrevious()){
                    System.out.println(iterator.previous());
                }
            }
        }
        }
}







