/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposBusqueda;

/**
 *
 * @author Anderson
 */
public class BusquedaInterpolacion {
    public static int busquedaInterpolacion(int[] mArray, int ElementoABuscar) {
    int indInicial = 0;
    int indFinal = (mArray.length - 1);
    while ((indInicial <= indFinal) && (ElementoABuscar >= mArray[indInicial]) &&
           (ElementoABuscar <= mArray[indFinal])) {
        // using interpolation formulae to find the best probable position for this element to exist
        int pos = indInicial + (((indFinal-indInicial) /
          (mArray[indFinal]-mArray[indInicial]))*
                        (ElementoABuscar - mArray[indInicial]));
        if (mArray[pos] == ElementoABuscar)
            return pos;
        if (mArray[pos] < ElementoABuscar)
            indInicial = pos + 1;
        else
            indFinal = pos - 1;
    }
    return -1;
}
    
}
