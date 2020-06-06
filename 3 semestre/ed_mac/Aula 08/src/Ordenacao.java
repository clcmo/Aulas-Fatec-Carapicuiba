class Ordenacao {

	private int[] v;
	public Ordenacao(int t){
		v = new int[t];
	}

	public void preencheVetor(){
		//valores randomicos

	}


	public void bubble() {
		int i, j, aux;
		for (i = 1; i < v.length; i++) {
			for (j = 0; j < v.length - 1; j++) {
				if (v[j] > v[j + 1]) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}

	public int partition(int v[], int p, int r){
		int i = p-1, j, aux;
		int x = v[r];
		for(j = p; j< r; j++){
			if(v[j] <=x){
				i = i+1;
				aux = v[j];
				v[j] = v[i];
				v[i] = aux;
			}
		}
		i = i+1;
		aux = v[r];
		v[r] = v[i];
		v[i] = aux;
		return i;
	}

	public void quick(int v[], int p, int r){
		if(p <r){
			int q = partition(v, p, r);
			quick(v, p, q-1);
			quick(v, q+1, r);
		}
	}


}
