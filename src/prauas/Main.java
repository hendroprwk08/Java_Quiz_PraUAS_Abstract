package prauas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, telepon;
        int jn, pl;
        
        Sewa s = new Sewa();
        System.out.print("Nama    : ");
        nama = sc.nextLine();
        System.out.print("Telepon : ");
        telepon = sc.nextLine();
        
        s.jenis();
        s.pelayanan();
        
        System.out.print("Jenis    : ");
        jn = sc.nextInt();
        System.out.print("Pelayanan: ");
        pl = sc.nextInt();
        
        System.out.println("--- Data Pemesanan ---");
        System.out.print("Nama :"+ nama);
        
        String[] hJenis = s.getJenis( ( jn-1 ) );
        System.out.println("Jenis : "+ hJenis[0] +" - "+ hJenis[1]); 
        
        String[] hPelayanan= s.getPelayanan( ( pl-1 ) );
        System.out.println("Jenis : "+ hPelayanan[0] +" - "+ hPelayanan[1]); 
        
        System.out.println("=======================");
        
        s.total = Integer.parseInt( hJenis[1] ) + Integer.parseInt( hPelayanan[1] );
        System.out.print("Total: "+ s.total );
    }
    
}
