import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner valez = new Scanner(System.in);

        linkedQueue lq = new linkedQueue();

        System.out.println("______To-Do List______");
        char ch;

        System.out.println("\n-----------------Pilihan Menu-----------------");
            System.out.println("1. Menambahkan Nama Pekerjaan");
                System.out.println("2. Menghapus Pekerjaan Yang Sudah Diselesaikan");
                     System.out.println("3. Melihat Data yang Terdepan");
                        System.out.println("4. Status Empty Nama Pekerjaan");
                         System.out.println("5. Status Jumlah Data\n");
        do
        {
            System.out.print("Pilih Menu :  ");
            int Pilih = valez.nextInt();
            switch (Pilih)
            {
                case 1:
                    System.out.print("Masukan Nama Pekerjaan : ");
                    lq.insert(valez.next());
                    break;
                            case 2:
                                try
                                {
                                    System.out.println("Removed Element = " + lq.remove());
                                }
                                catch (Exception e)
                                {
                                    System.out.println("Error : " + e.getMessage());
                                }
                                break;
                                        case 3:
                                            try
                                            {
                                                System.out.println("Peek Element = " + lq.peek());
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("Error : " + e.getMessage());
                                            }
                                            break;
                                                    case 4:
                                                        System.out.println("Empty status = " + lq.isEmpty());
                                                        break;

                                                                case 5:
                                                                    System.out.println("Size = " + lq.getSize());
                                                                    break;

                                                                    default:
                                                                        System.out.println("Wrong Entry \n ");
                                                                        break;
                                                                }
            // display queue
            lq.display();

            System.out.print("\nApakah Ingin Melanjutkan ( 'Y' Atau 'N') : ");

            ch = valez.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');

    }

}
