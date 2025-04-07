class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		String a;
		String b;
		String c;

		for (int i = 2992; i < 10000; i++) {
			a = i + "";
			b = Integer.toString(i, 12);
			c = Integer.toHexString(i);

			int as = 0;
			int bs = 0;
			int cs = 0;

			for (char ac : a.toCharArray()) {
				as += ac - '0';
			}

			for (char bc : b.toCharArray()) {
				if (Character.isDigit(bc)) {
					bs += bc - '0';
				} else {
					bs += bc - 'a' + 10;
				}
			}

			for (char cc : c.toCharArray()) {
				if (Character.isDigit(cc)) {
					cs += cc - '0';
				} else {
					cs += cc - 'a' + 10;
				}
			}

			if (as == bs && bs == cs) {
				sb.append(i).append("\n");
			}
		}

		System.out.println(sb);
	}
}