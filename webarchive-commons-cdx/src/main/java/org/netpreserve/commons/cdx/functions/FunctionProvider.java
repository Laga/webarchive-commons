/*
 * Copyright 2015 IIPC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.netpreserve.commons.cdx.functions;

/**
 * Factory for creating new instances of a {@link Function}.
 * <p>
 * In cases where a function can't be made stateless and thread safe, a function provider should be
 * used. The purpose of the function provider is to instantiate a new function for every use.
 * <p>
 * @param <T> the type of function generated by this provider
 */
public interface FunctionProvider<T extends Function> {

    /**
     * Create a new instance of a function.
     * <p>
     * @return the new instance.
     */
    T newFunction();

}
