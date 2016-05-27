/*
 * Copyright (C) 2016 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.dacs2016.sepa.model.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Dr. Jorge Eduardo Villaverde
 * @see https://es.wikipedia.org/wiki/European_Article_Number
 */
public class EAN13Validator implements ConstraintValidator<EAN13, String> {

	@SuppressWarnings("unused")
	private EAN13 ean13;

	@Override
	public void initialize(EAN13 ean13) {
		this.ean13 = ean13;
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value == null)
			return false;

		boolean isValid = false;

		try {
			String firstTwelveDigits = value.substring(0, 12);
			int dv = controlCodeCalculator(firstTwelveDigits);
			Integer dvValue = Integer.valueOf(value.substring(12));
			
			if(dvValue.intValue() == dv) {
				isValid = true;
			}
			
		} catch (NumberFormatException e) {
		}
		
		if (!isValid) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(
					"{ar.edu.utn.frre.dacs.dacs2016.sepa.model.EAN13.message}");
		}

		return isValid;
	}

	/**
	 * Cálculo del código de control
	 */
	public static int controlCodeCalculator(String firstTwelveDigits) {
		char[] charDigits = firstTwelveDigits.toCharArray();
		int[] ean13 = { 1, 3 };
		int sum = 0;
		for (int i = 0; i < charDigits.length; i++) {
			sum += Character.getNumericValue(charDigits[i]) * ean13[i % 2];
		}
		int checksum = 10 - sum % 10;

		if (checksum == 10)
			checksum = 0;

		return checksum;
	}
}
