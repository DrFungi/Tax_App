package edu.b11.tp.tax.cs.persistence;


import edu.b11.tp.tax.cs.model.TaxAuthority;
import edu.b11.tp.tax.cs.model.TaxBracket;

import java.util.List;

public interface ITaxBracketDAO {
    TaxAuthority getTaxAuthorityByLabel(String taxAuthority);

    List<TaxBracket> getTaxBracketsByAuthorityId(int authorityId);
}
