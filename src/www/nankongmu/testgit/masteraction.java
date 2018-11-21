package www.nankongmu.testgit;

public class masteraction {
	public static void main(String[] args) {
		System.out.println("输出发布版本,版本号"+getVersion());
	}
	public static String getVersion(){
		String version = "v1.0.0";
		return version;
	}
}
