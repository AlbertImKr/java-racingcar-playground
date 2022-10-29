package string_calculator;

import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
	private final static Validator validator = new Validator();
	private final static Pattern customPattern = Pattern.compile("//(.)\n(.*)");


	static int splitAndSum(String str) {
		if (str == null || str.equals("")) {
			return 0;
		}
		Matcher matcher = customPattern.matcher(str);
		if (matcher.find()) {
			return getCustomPatternInteger(matcher);
		}
		return getSemicolonAndCommaInteger(str);
	}

	private static int getSemicolonAndCommaInteger(String str) {
		int answer = 0;
		String[] split = str.split(",|:");
		validator.validate(split);
		for (String s : split) {
			answer += Integer.parseInt(s);
		}
		return answer;
	}

	private static Integer getCustomPatternInteger(Matcher matcher) {
		String customDelimiter = matcher.group(1);
		String[] tokens = matcher.group(2).split(customDelimiter);
		validator.validate(tokens);
		Optional<Integer> reduce = Arrays.stream(tokens)
			.map(Integer::parseInt)
			.reduce((a, b) -> a + b);
		return reduce.get();
	}
}
