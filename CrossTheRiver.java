import java.util.*;


public class CrossTheRiver{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	    int N=sc.nextInt();
	    int R=sc.nextInt();
	    
	    int count=0;
	    int[] arr=new int[N];
	    List<Rock> rockList = new ArrayList<Rock>();
	    List<Rocktemp> rocktmpList = new ArrayList<Rocktemp>();
	    for(int i=0;i<R;i++){
	    	int x=sc.nextInt();
		    int y=sc.nextInt();
		    int r=sc.nextInt();
		    Rocktemp rck = new Rocktemp(i+1, x, y, r); 
		    rocktmpList.add(rck);
	    }
		int shore_b = sc.nextInt(); 
		int shore_a = sc.nextInt();
		for(int j=0;j<rocktmpList.size();j++){
			rockList.add(new Rock(rocktmpList.get(j).index, rocktmpList.get(j).x, rocktmpList.get(j).y,rocktmpList.get(j).r, shore_a, shore_b));
			
			
			
		}
		/*List<Rock> rockList1 = new ArrayList<Rock>();
		rockList.add(new Rock(1, 1, 1, 2, shore_a, shore_b));
		rockList.add(new Rock(2, 1, 2, 1, shore_a, shore_b));
		rockList.add(new Rock(3, 3, 4, 1, shore_a, shore_b));*/
		solve(rockList, shore_a, shore_b);
	}
	public static void solve(List<Rock> rockList, int shore_a, int shore_b){
		Path path = null;
		for(Rock r: rockList){
			if(r.touchShoreA && r.touchShoreB){
				path = new Path(r);
				break;
			}
			if(r.touchShoreA){
				path = findPath(r, rockList);
				if(path != null){
					break;
				}
			}
		}
		if(path != null ){
			System.out.println(path);
		}
	}
	public static Path findPath(Rock rock, List<Rock> rockList){
		if(rock.neighbers != null){
			return null;
		}
		for(Rock r: rockList){
			if(rock.index != r.index
			&& rock.r + r.r - Math.sqrt(Math.pow(rock.y - r.y, 2) + Math.pow(rock.x - r.x, 2))>0 ){
				if(r.touchShoreB){
					//found path
					Path p = new Path(rock);
					p.next = new Path(r);
					return p;
				}
				List<Rock> neighbers = rock.neighbers;
				if(neighbers == null){
					neighbers = new ArrayList<Rock>();
				}
				neighbers.add(r);
				rock.neighbers = neighbers;
			}
		}
		for(Rock r: rock.neighbers){
			Path next = findPath(r, rockList);
			if(next != null){
				Path p = new Path(rock);
				p.next = next;
				return p;
			}
		}
		return null;
	}
}

class Path{
	Rock r;
	Path next;
	Path(Rock r){
		this.r = r;
	}
	@Override
	public String toString(){
		return r.index + (next == null ? "" : ("->" + next.toString()));
	}
}
class Rock{
	int index;
	int x; 
	int y;
	int r; 
	boolean touchShoreA = false; 
	boolean touchShoreB = false; 
	// neighbersClosertoShore, y + r bigger or equals this
	List<Rock> neighbers;
	Rock(int index, int x, int y, int r, int shore_a, int shore_b){
		this.x = x; 
		this.y = y; 
		this.r = r;
		this.index = index;
		this.touchShoreA = (Math.abs(y - r) <= r) ;
		this.touchShoreB = (Math.abs(shore_b - y)<= r); 
	}
	
}

class Rocktemp{
	int index;
	int x; 
	int y;
	int r; 
	
	// neighbersClosertoShore, y + r bigger or equals this
	Rocktemp(int index, int x, int y, int r){
		this.x = x; 
		this.y = y; 
		this.r = r;
		this.index = index;
		 
	}
}