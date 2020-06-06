class TestesRecursao{

	static int fatorial(int n){
		if(n == 0)
			return 1;
		return n * fatorial(n -1);
	}

	static int fibonacci(int n){
		if(n == 1 || n == 2)
			return 1;
		return fibonacci(n-2) + fibonacci(n-1);
	}

	public static void main(String[] args) {
		int v[] = {1,2,3,4,5};
		System.out.println("Fatorial de 4 é " + fatorial(4));
		System.out.println("Fibonacci de 4 é " + fibonacci(4));
		System.out.println("Soma Vetor: " + somaVetor(v, 5));
		System.out.println("Soma Vetor com Recursão: " + somaVetorRec1(v, 4, 0));
	}
		
	
	static int somaVetor(int v[], int n){
		int s = 0;
		for(int i = 0; i<n; i++){
			s += v[i];
		}
		return s;
	}
	
	static int somaVetorRec1(int v[], int n, int i){
		if(i == n) return 0;
		return v[i] + somaVetorRec1(v, n, i+1);
	}

	static int somaVetorRec2(int v[], int i){
		if(i == 0) return v[0];
		return v[i] + somaVetorRec2(v, i-1);
	}
}
