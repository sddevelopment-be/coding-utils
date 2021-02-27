/*-
 * #%L
 * code-utils
 * %%
 * Copyright (C) 2020 SD Development
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

package be.sddevelopment.commons.exceptions;

import java.util.function.Function;
import lombok.experimental.UtilityClass;

/**
 * <p>
 * When using functional programming techniques in java 8+,
 * a common issue is the inability to chain operations using method references if those
 * called methods throw a checked exception. <br />
 * This class is meant to <b>suppress these checked exceptions</b>.
 * <br /><br />
 * It can also be used to write your exception handling in a more fluent way,
 * and to facilitate designs based on using Unchecked Exceptions.
 * </p>
 *
 * <h6>Example usage</h6>
 *
 * <h6>References</h6>
 *
 * @author <a href="https://github.com/stijn-dejongh" target="_blank">Stijn Dejongh</a>
 * @version 1.0.0
 * @created 01.11.20, Sunday
 * @since 1.0.0
 */
@UtilityClass
public final class ExceptionSuppressor {

  public static <T, R> Function<T, R> ignore(FallibleFunction<T, R> toWrap) {
    return t -> {
      try {
        return toWrap.apply(t);
      } catch (Exception e) {
        return null;
      }
    };
  }


  public static <T, R> Function<T, R> uncheck(FallibleFunction<T, R> toWrap) {
    return t -> {
      try {
        return toWrap.apply(t);
      } catch (Exception e) {
        throw new WrappedException(e);
      }
    };
  }
}
