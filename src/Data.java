import java.awt.Color;

/**
 * Klasa przechowująca parametry statyczne w celu umożliwienia dostępu do nich z dowolnego miejsca programu
 *
 */
public class Data {
	
	public static final int WindowSize = 600;
	public static final int Dimension = 100;

	public static Graph StartGraph = new Graph();
	
	public static final Color Background = Color.WHITE;
	public static final Color NodeColor = Color.BLUE;
	public static final Color EdgeColor = Color.BLACK;
	
	public static final int NodeSize = 6;
	public static final int EdgeWidth = 1; // nieużywane
	
	public static int wallForce = 10; //w procentach %
	public static int kFactor = 100; //w procentach %
	public static int tempDecrease = 2; //(+)*100
	public static int iterations = 300;
	
}
