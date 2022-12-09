package prauas;

import java.util.HashMap;
import java.util.Map;

abstract class AbsSewa {
    Map<String, String> mJenis;
    Map<String, String> mPelayanan;
    String nama;
    int total;
    
    public void pelayanan() {
        mPelayanan = new HashMap<>();
        
        //tampung kedalam "key" dan "value"
        mPelayanan.put("Eksekutif", "2500");
        mPelayanan.put("VIP", "3500");
        mPelayanan.put("Suite", "5500");
        
        System.out.println("--- P E L A Y A N A N ---");
        int no = 1;
        for (String i : mPelayanan.keySet()) {
            System.out.println( (no++) +". " + 
                                i + ": " + mPelayanan.get(i));
        }
    }

    public void jenis() {
        mJenis = new HashMap<>();
        
        //tampung kedalam "key" dan "value"
        mJenis.put("Anggrek", "3500");
        mJenis.put("Mawar", "5000");
        mJenis.put("Lily", "6500");
        
        System.out.println("--- J E N I S ---");
        int no = 1;
        for (String i : mJenis.keySet()) {
            System.out.println( (no++) +". " + 
                                i + ": " + mJenis.get(i));
        }
    }

    public void total() {
        this.total = 0;
    }

    String cekData( String nama ){
        this.nama = nama;
        return this.nama;
    }
    
}
