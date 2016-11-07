/**
 */
package rootElement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rootElement.RootElementPackage
 * @generated
 */
public interface RootElementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootElementFactory eINSTANCE = rootElement.impl.RootElementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type1</em>'.
	 * @generated
	 */
	DataType1 createDataType1();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Class1 createClass1();

	/**
	 * Returns a new object of class '<em>Data Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type2</em>'.
	 * @generated
	 */
	DataType2 createDataType2();

	/**
	 * Returns a new object of class '<em>Component1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component1</em>'.
	 * @generated
	 */
	Component1 createComponent1();

	/**
	 * Returns a new object of class '<em>Data Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type3</em>'.
	 * @generated
	 */
	DataType3 createDataType3();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RootElementPackage getRootElementPackage();

} //RootElementFactory
