package org.eclipse.cdt.dsf.mi.service;

import org.eclipse.cdt.dsf.debug.service.IExpressions.IExpressionDMContext;
import org.eclipse.cdt.dsf.mi.service.MIExpressions.MIExpressionDMC;

public class ClassAccessor {

	public static class MIExpressionDMCAccessor {
		private MIExpressionDMC miExprDmc;
		
		public MIExpressionDMCAccessor(IExpressionDMContext dmc) {
			miExprDmc = (MIExpressionDMC) dmc;
		}

        @Override
        public boolean equals(Object other) {
            return miExprDmc.equals(other);
        }
        
        @Override
        public int hashCode() {
            return miExprDmc.hashCode();
        }
        
        @Override
        public String toString() {
            return miExprDmc.toString(); 
        }
        
        public String getExpression() {
            return miExprDmc.getExpression();
        }
        
		public String getRelativeExpression() {
			return miExprDmc.getRelativeExpression();
		}
	}
}
