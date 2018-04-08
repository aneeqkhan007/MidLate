package math;


		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		public class PrimeNumber {


			public static void main(String[] args) {
				long value;
				long start;
				long finish;

				start = System.nanoTime();
				value = arrayMethod(2000000);
				finish = System.nanoTime();
				System.out.printf("Value: %.3e, time: %4d ms\n", (double) value, (finish - start) / 1000000);

				start = System.nanoTime();
				value = treeMethod(2000000);
				finish = System.nanoTime();
				System.out.printf("Value: %.3e, time: %4d ms\n", (double) value, (finish - start) / 1000000);
			}

			private static long treeMethod(int i) {
				return 0;
			}

			private static long arrayMethod(long i) {
				return 0;
			}
		}