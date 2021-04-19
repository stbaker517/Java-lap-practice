
public class Library {
	
	Book[] books=new Book[10];	
	public Library() {
		
		for(int i=0;i<10;i++)
		{
			books[i]=new Book();
		}
		
	};
	public void returnBook(int n)
	{
		if(books[n].borrow!=true)//In library
		{
			System.out.println("It's already in Libarary!");
			return;
		}
		else
		{
			books[n].borrow=false;
			return ;
		}
	}
	public void borrowBook(int n)
	{
		if(books[n].borrow!=false)//In library
		{
			System.out.println("It's not in Libarary!");
			return;
		}
		else
		{
			books[n].borrow=true;
			return ;
		}
	}

	
}
