/**
 */
package rootElement.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rootElement.DataType1;
import rootElement.DataType2;
import rootElement.RootElementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rootElement.impl.DataType2Impl#getDatatype1 <em>Datatype1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataType2Impl extends MinimalEObjectImpl.Container implements DataType2 {
	/**
	 * The cached value of the '{@link #getDatatype1() <em>Datatype1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype1()
	 * @generated
	 * @ordered
	 */
	protected DataType1 datatype1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RootElementPackage.Literals.DATA_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType1 getDatatype1() {
		return datatype1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype1(DataType1 newDatatype1, NotificationChain msgs) {
		DataType1 oldDatatype1 = datatype1;
		datatype1 = newDatatype1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RootElementPackage.DATA_TYPE2__DATATYPE1, oldDatatype1, newDatatype1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype1(DataType1 newDatatype1) {
		if (newDatatype1 != datatype1) {
			NotificationChain msgs = null;
			if (datatype1 != null)
				msgs = ((InternalEObject)datatype1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RootElementPackage.DATA_TYPE2__DATATYPE1, null, msgs);
			if (newDatatype1 != null)
				msgs = ((InternalEObject)newDatatype1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RootElementPackage.DATA_TYPE2__DATATYPE1, null, msgs);
			msgs = basicSetDatatype1(newDatatype1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RootElementPackage.DATA_TYPE2__DATATYPE1, newDatatype1, newDatatype1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RootElementPackage.DATA_TYPE2__DATATYPE1:
				return basicSetDatatype1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RootElementPackage.DATA_TYPE2__DATATYPE1:
				return getDatatype1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RootElementPackage.DATA_TYPE2__DATATYPE1:
				setDatatype1((DataType1)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RootElementPackage.DATA_TYPE2__DATATYPE1:
				setDatatype1((DataType1)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RootElementPackage.DATA_TYPE2__DATATYPE1:
				return datatype1 != null;
		}
		return super.eIsSet(featureID);
	}

} //DataType2Impl
