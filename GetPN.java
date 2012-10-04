//package getpkg;
class GetPN{
	public static void main(String arg[])
		{GetPN a = new GetPN();
		System.out.println("a\bp");
		IntegerExp b = new IntegerExp();
		Package pkg = a.getClass().getPackage();
		System.out.println("Name = "+pkg);
		}
	}