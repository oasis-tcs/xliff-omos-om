/**
 */
package rootElement.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rootElement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rootElement.RootElementPackage
 * @generated
 */
public class RootElementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RootElementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RootElementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementSwitch<Adapter> modelSwitch =
		new RootElementSwitch<Adapter>() {
			@Override
			public Adapter caseDataType1(DataType1 object) {
				return createDataType1Adapter();
			}
			@Override
			public Adapter caseClass1(Class1 object) {
				return createClass1Adapter();
			}
			@Override
			public Adapter caseDataType2(DataType2 object) {
				return createDataType2Adapter();
			}
			@Override
			public Adapter caseComponent1(Component1 object) {
				return createComponent1Adapter();
			}
			@Override
			public Adapter caseDataType3(DataType3 object) {
				return createDataType3Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rootElement.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rootElement.DataType1
	 * @generated
	 */
	public Adapter createDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rootElement.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rootElement.Class1
	 * @generated
	 */
	public Adapter createClass1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rootElement.DataType2 <em>Data Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rootElement.DataType2
	 * @generated
	 */
	public Adapter createDataType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rootElement.Component1 <em>Component1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rootElement.Component1
	 * @generated
	 */
	public Adapter createComponent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rootElement.DataType3 <em>Data Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rootElement.DataType3
	 * @generated
	 */
	public Adapter createDataType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RootElementAdapterFactory
