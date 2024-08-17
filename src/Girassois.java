
public class Girassois {

	private int[] SequenciaF;

	public Girassois() {
		SequenciaF = new int[24];
	}

	public void addValoresVetor() {

		for (int i = 0; i < SequenciaF.length; i++) {
			if (i == 0 || i == 1) {
				SequenciaF[i] = i;
			} else {
				SequenciaF[i] = SequenciaF[i - 1] + SequenciaF[i - 2];
			}
		}
	}

	public int getValVetor(int val) {
		return SequenciaF[val];
	}

	public boolean verifyIfFake(int s1, int s2) {
		int val = 0;
		for (int i = 0; i < SequenciaF.length; i++) {
			if (SequenciaF[i] == s1) {
				if (SequenciaF[i + 1] == s2 || SequenciaF[i - 1] == s2) {
					val = 1;
				}
			}
		}
		return val == 1;
	}

}
