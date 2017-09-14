import builders.dsl.spreadsheet.builder.poi.PoiSpreadsheetBuilder

class SpreadsheetWriterForGroovy {
    static void main(String... args) {
        File file = new File('out/spreadsheet.xlsx')

        PoiSpreadsheetBuilder.create(file).build {
            sheet('Sample') {
                row {
                    cell 'A'
                    cell 'B'
                    cell 'C'
                }
                row {
                    cell 1
                    cell 2
                    cell 3
                }
            }
        }
    }
}

