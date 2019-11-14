package classes;

	class X{
		static int x = 3131;
		
		static class Y{
			
			static int y = x++;
			
			static class Z{
				
				static int z = y++;
			}
		}
	}
	
	public class MainClass{
		
		public void main(String[] args) {
			System.out.println(X.x);
			System.out.println(X.Y.y);
			System.out.println(X.Y.Z.z);
		}
	}