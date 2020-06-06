class TestesRecursao{
	static int fatorial(int n){
		if(n == 0)
			return 1;
		return n * fatorial(n -1);
	}

	static int fibonacci(int n){
		if(n == 1 || n == 2)
			return 1;
		return fiboacci(n-2) + fibonacci(n-1);
	}

	System.out.println("Fatorial de 4 é " + fatorial(4));
	System.out.println("Fibonacci de 4 é " + fibonacci(4));
}
