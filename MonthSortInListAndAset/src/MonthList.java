import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MonthList {

	public static void main(String[] args) {

		List<String> months = new ArrayList<String>();

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

		Collections.sort(months, new Comparator<String>() {

			public int compare(String o1, String o2) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("MMM");
					return sdf.parse(o1).compareTo(sdf.parse(o2));
				} catch (Exception e) {
					return o1.compareTo(o2);
				}
			}

		});
		
		System.out.println("Sorted Months"+ months);

	}

}
