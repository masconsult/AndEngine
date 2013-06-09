package org.andengine.entity.modifier;

import org.andengine.entity.IEntity;
import org.andengine.entity.shape.IAreaShape;
import org.andengine.util.modifier.ease.IEaseFunction;

public class HeightModifier extends SingleValueSpanEntityModifier {

	public HeightModifier(float pDuration, float pFromValue, float pToValue) {
		super(pDuration, pFromValue, pToValue);
	}

	public HeightModifier(float pFromValue, float pToValue) {
		super(1f, pFromValue, pToValue);
		setAutoUnregisterWhenFinished(false);
	}
	
	public HeightModifier(float pDuration, float pFromValue, float pToValue,
			IEaseFunction pEaseFunction) {
		super(pDuration, pFromValue, pToValue, pEaseFunction);
	}

	public HeightModifier(float pDuration, float pFromValue, float pToValue,
			IEntityModifierListener pEntityModifierListener) {
		super(pDuration, pFromValue, pToValue, pEntityModifierListener);
	}

	public HeightModifier(float pDuration, float pFromValue, float pToValue,
			IEntityModifierListener pEntityModifierListener, IEaseFunction pEaseFunction) {
		super(pDuration, pFromValue, pToValue, pEntityModifierListener, pEaseFunction);
	}

	public HeightModifier(SingleValueSpanEntityModifier pSingleValueSpanEntityModifier) {
		super(pSingleValueSpanEntityModifier);
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void onSetInitialValue(final IEntity pEntity, final float pHeight) {
		setHeight(pEntity, pHeight);
	}

	@Override
	protected void onSetValue(final IEntity pEntity, final float pPercentageDone, final float pHeight) {
		setHeight(pEntity, pHeight);
	}
	
	private void setHeight(final IEntity pEntity, final float pHeight) {
		if(pEntity instanceof IAreaShape) {
			IAreaShape item = (IAreaShape) pEntity;
			item.setHeight(pHeight);
		}
	}
	
	@Override
	public IEntityModifier deepCopy()
			throws org.andengine.util.modifier.IModifier.DeepCopyNotSupportedException {
		return null;
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
