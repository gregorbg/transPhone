import com.suushiemaniac.lang.transphone.emit.StuttgartFiniteStateTransducer;
import com.suushiemaniac.lang.transphone.model.GenPhonRule;
import com.suushiemaniac.lang.transphone.parse.GenPhonRuleReader;

public class Main { // TODO GLOBAL regexp regexp
	public static void main(String[] args) {
		GenPhonRuleReader reader = new GenPhonRuleReader();
		GenPhonRule rule = reader.parse("^:e -> [dt]__#");

		System.out.println(rule.apply("bad^"));
		System.out.println(rule.apply("bad^st"));
		System.out.println(rule.apply("leg^st"));
		System.out.println(rule.apply("leg^t"));

		System.out.println(StuttgartFiniteStateTransducer.from(rule));
	}
}
