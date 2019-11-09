import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MonthSet {

	public static void main(String[] args) {

		Set<String> months = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat sdf = new SimpleDateFormat("MMM");

				try {
					return sdf.parse(o1).compareTo(sdf.parse(o2));
				} catch (ParseException e) {
					return o1.compareTo(o2);
				}
			}

		});

		months.add("Feb");
		months.add("Jan");
		months.add("Apr");
		months.add("Mar");
		months.add("Jun");
		months.add("May");
		months.add("Sep");
		months.add("Aug");
		months.add("Nov");
		months.add("Dec");
		months.add("Oct");
		months.add("Jul");

		System.out.println(months);

	}

}
