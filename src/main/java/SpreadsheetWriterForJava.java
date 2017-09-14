import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder;
import java.io.File;
import java.io.FileNotFoundException;

import static builders.dsl.spreadsheet.api.Keywords.*;

public class SpreadsheetWriterForJava {

    public static void main(String... args) throws FileNotFoundException {
        File file = new File("out/spreadsheet.xlsx");

		PoiSpreadsheetBuilder.create(file).build(w -> {                                 
			w.sheet("Sample", s -> {                                                    
				s.row(r -> {                                                            
					r.cell("A");                                                        
					r.cell("B");
					r.cell("C");
				});
				s.row(r -> {
					r.cell(1);
					r.cell(2);
					r.cell(3);
				});
			});
		});
    }

}
