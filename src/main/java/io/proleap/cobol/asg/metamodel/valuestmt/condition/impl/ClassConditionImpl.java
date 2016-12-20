/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.valuestmt.condition.impl;

import io.proleap.cobol.Cobol85Parser.ClassConditionContext;
import io.proleap.cobol.Cobol85Parser.SimpleConditionContext;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.valuestmt.condition.ClassCondition;
import io.proleap.cobol.asg.metamodel.valuestmt.impl.ValueStmtImpl;

public class ClassConditionImpl extends ValueStmtImpl implements ClassCondition {

	protected ClassConditionContext ctx;

	public ClassConditionImpl(final ProgramUnit programUnit, final ClassConditionContext ctx) {
		super(programUnit, ctx);
	}

	@Override
	public String getValue() {
		return null;
	}

}