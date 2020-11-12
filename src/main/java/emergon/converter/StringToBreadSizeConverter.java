package emergon.converter;

import emergon.entity.BreadSize;
import emergon.service.BreadSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class StringToBreadSizeConverter implements Converter<String, BreadSize>{

    @Autowired
    private BreadSizeService service;
    
    @Override
    public BreadSize convert(String source) {
        //Get the id of the breadSize selection
        //Find the Entity from the Database
        //Return the Entity
        int id = Integer.parseInt(source);
        BreadSize size = service.findById(id);
        return size;
    }
    
}
