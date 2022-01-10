class MainSample 
{
	int x, y;

	MainSample()
	{
		this.x = 10;
		this.y = 20;
	}

	MainSample(int a, int b)
	{
		x = a;
		y = b;
	}

	public void show()
	{
		System.out.println("X and Y values are : " + x + " " + y);
	}

	public static void main(String[] args) 
	{
		MainSample t = new MainSample(5, 6);
		t.show();
	}
}