package Code;

public class Carre extends Obj{
	   int x,y;
	     int h;
	     
	     public Carre(String nom,int x,int y,int h) {
	    	 super(nom,x,y,h);
	    	 
	    	 
	     }
	     public String getNom() {
	    	 return nom;
	     }
	     public int get_x() {
	    	 return super.get_x();
	     }
	     public int get_y() {
	    	 return super.get_y();
	     }
	     public int get_h() {
	    	 return super.get_h();
	     }
	     public String getCentre() {
	    	 return "("+x+","+y+")";
	     }
	     public String toString() {
	    	 return "("+getNom()+"( centre "+getCentre()+","+get_h()+"))";
	     }
		@Override
		public boolean isRep() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public int get_z() {
			// TODO Auto-generated method stub
			return 0;
		}
}
