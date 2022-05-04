package composite;

import java.util.ArrayList;

public class Structure extends ANode{
	
	private String name;
	//missing price;
	
	private ArrayList<ANode> list = new ArrayList<ANode>();

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public Structure(String name) {
		super();
		this.name = name;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(ANode elem) {
		// TODO Auto-generated method stub
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) {
		// TODO Auto-generated method stub
		//super.removeNode(elem); nu aruncam exceptie
		list.remove(elem);
		
	}

	@Override
	public ANode getNode(int index) {
		// TODO Auto-generated method stub
		//super.getNode(index);
		return this.list.get(index);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		//return super.getInfo();
		String info = ""+this.getName()+" \n";
		for(ANode nod:list) {
			info+=" "+ nod.getInfo() + " \n";
		}
		
		return info;
	}
	
	

}
