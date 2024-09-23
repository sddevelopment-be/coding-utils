/*-
 * #%L
 * code-utils
 * %%
 * Copyright (C) 2020 - 2021 SD Development
 * %%
 * Licensed under the EUPL, Version 1.1 or – as soon they will be
 * approved by the European Commission - subsequent versions of the
 * EUPL (the "Licence");
 *
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 * http://ec.europa.eu/idabc/eupl5
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * #L%
 */
package be.sddevelopment.commons.access;

import static be.sddevelopment.commons.access.AccessProtectionUtils.utilityClassConstructor;

import lombok.SneakyThrows;

/**
 * <class_description>
 * <p><b>notes</b>:
 * <p>ON : Feb 27, 2021
 *
 * @author <a href="https://github.com/stijn-dejongh" target="_blank">Stijn Dejongh</a>
 */
public class UtilityClass {

	@SneakyThrows
	private UtilityClass() {
		utilityClassConstructor();
	}

}