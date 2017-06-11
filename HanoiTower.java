import java.util.Scanner;

public class HanoiTower{
	//level代表盘子个数;三个char类型代表柱子
	public static void moveDish(int level, char from, char inter, char to){
		if(level == 1){
			System.out.println("从"+from+"移动盘子1号到"+to);
		}else{
			
			moveDish(level-1,from,to,inter);//调用自身
			System.out.println("从"+from+"移动盘子"+level+"号到"+to);
			moveDish(level-1,inter,from,to);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入盘子个数");
		int n = sc.nextInt();
		moveDish(n,'a','b','c');
	}
}