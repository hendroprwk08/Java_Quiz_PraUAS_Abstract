package prauas;

public class Sewa extends AbsSewa{

    @Override
    String cekData(String nama) {
        return super.cekData(nama); 
    }
    
    @Override
    public void total() {
        super.total = 0; 
    }

    @Override
    public void pelayanan() {
        super.pelayanan();
    }

    @Override
    public void jenis() {
        super.jenis();
    }
    
    String[] getJenis(int x){
        Object xKey = super.mJenis.keySet().toArray()[x];
        Object xValue = super.mJenis.get(xKey);
        
        //set ke array
        String[] hasil = { xKey.toString(), xValue.toString() };
        return hasil;
    }
    
    String[] getPelayanan(int x){
        Object xKey = super.mPelayanan.keySet().toArray()[x];
        Object xValue = super.mPelayanan.get(xKey);
        
        //set ke array
        String[] hasil = { xKey.toString(), xValue.toString() };
        return hasil;
    }

}
