/*
 * IMemberDefinition.java
 *
 * Copyright (c) 2013 Mike Strobel
 *
 * This source code is based on Mono.Cecil from Jb Evain, Copyright (c) Jb Evain;
 * and ILSpy/ICSharpCode from SharpDevelop, Copyright (c) AlphaSierraPapa.
 *
 * This source code is subject to terms and conditions of the Apache License, Version 2.0.
 * A copy of the license can be found in the License.html file at the root of this distribution.
 * By using this source code in any fashion, you are agreeing to be bound by the terms of the
 * Apache License, Version 2.0.
 *
 * You must not remove this notice, or any other, from this software.
 */

package com.strobel.assembler.metadata;

/**
 * User: Mike Strobel
 * Date: 1/6/13
 * Time: 5:37 PM
 */
public interface IMemberDefinition {
    String getName();
    String getFullName();
    boolean isSpecialName();
    TypeReference getDeclaringType();
    long getFlags();
    int getModifiers();
    boolean isFinal();
    boolean isNonPublic();
    boolean isPrivate();
    boolean isProtected();
    boolean isPublic();
    boolean isStatic();
    boolean isSynthetic();
    boolean isDeprecated();
    boolean isPackagePrivate();
    String getBriefDescription();
    String getDescription();
    String getErasedDescription();
    String getSimpleDescription();
}