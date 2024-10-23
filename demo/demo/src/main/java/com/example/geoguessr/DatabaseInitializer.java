package com.example.geoguessr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.geoguessr.model.ImageLocation;
import com.example.geoguessr.repository.ImageLocationRepository;
import java.util.UUID;

import javax.annotation.PostConstruct;

@Component
public class DatabaseInitializer {

    @Autowired
    private ImageLocationRepository locationImageRepository; // Inject your repository

    @PostConstruct
    public void init() {
        // Check if the database is empty before adding initial data
        if (locationImageRepository.count() == 0) {
            // Create and save all Anki cards
            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/99/22399-050-FFE3FA25/Hydrogen-H-Its-symbol-square-hydrogen-properties.jpg",
                "Hydrogen"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/98/22398-050-C3608B35/element-helium-symbol-square-properties-some-periodic.jpg",
                "Helium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/97/22397-050-9EA22B15/Lithium-lithium-symbol-square-Li-properties-some.jpg",
                "Lithium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/96/22396-050-5BD73E55/Beryllium-beryllium-symbol-square-Be-properties-some.jpg",
                "Beryllium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/95/22395-050-2A311AB4/B-Its-element-Boron-square-symbol-periodic.jpg",
                "Boron"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/94/22394-050-619F56C9/element-symbol-square-C-Its-properties-some.jpg",
                "Carbon"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/93/22393-050-41E81EB6/Nitrogen-symbol-square-nitrogen-some-properties-periodic.jpg",
                "Nitrogen"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/92/22392-050-148E8CC1/properties-weight-chemical-element-crystal-structure-atomic.jpg",
                "Oxygen"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/91/22391-050-D2C85CA3/Fluorine-F-Its-square-fluorine-symbol-properties.jpg",
                "Fluorine"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/90/22390-050-6623F39C/Neon-neon-symbol-square-properties-some-periodic.jpg",
                "Neon"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/89/22389-050-617AD825/element-alkali-metal-symbol-square-Na-properties.jpg",
                "Sodium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/88/22388-050-66BFFDB1/Magnesium-magnesium-symbol-square-Mg-properties-some.jpg",
                "Magnesium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/87/22387-050-7A51BA97/Aluminum-aluminum-symbol-square-Al-properties-some.jpg",
                "Aluminum"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/86/22386-050-51E63D13/Silicon-silicon-symbol-square-Si-properties-some.jpg",
                "Silicon"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/85/22385-050-8C724F16/Phosphorus-P-Its-phosphorus-square-symbol-properties.jpg",
                "Phosphorus"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/84/22384-050-3478E04D/element-S-Its-symbol-properties-some-periodic.jpg",
                "Sulfur"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/83/22383-050-6D450CBC/Chlorine-chlorine-symbol-square-Cl-properties-some.jpg",
                "Chroline"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/82/22382-050-290C9D77/Argon-argon-symbol-square-properties-some-periodic.jpg",
                "Argon"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/81/22381-050-E3372C94/properties-Potassium.jpg",
                "Potassium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/80/22380-050-56F1E872/Calcium-earth-metal-symbol-square-Ca-properties.jpg",
                "Calcium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/79/22379-050-409DA777/Scandium-symbol-square-Sc-properties-some-periodic.jpg",
                "Scandium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/78/22378-050-8CBC8430/Titanium-titanium-symbol-square-Ti-properties-some.jpg",
                "Titanium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/77/22377-050-5B288E22/V-Its-Vanadium-vanadium-symbol-properties-some.jpg",
                "Vanadium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/76/22376-050-A1A77DD8/Chromium-chromium-symbol-square-properties-some-periodic.jpg",
                "Chromium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/75/22375-050-46A6A94F/Manganese-manganese-symbol-square-Mn-properties-some.jpg",
                "Manganese"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/74/22374-050-BF062A43/symbol-element-iron-Fe.jpg",
                "Iron"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/73/22373-050-143340CB/element-cobalt-symbol-square-Co-properties-some.jpg",
                "Cobalt"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/72/22372-050-801FBBFB/element-nickel-symbol-square-Ni-properties-some.jpg",
                "Nickel"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/71/22371-050-EDBB097F/element-copper-symbol-square-Cu-properties-some.jpg",
                "Copper"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/70/22370-050-5614C41E/element-metal-Zn-square-properties-some-periodic.jpg",
                "Zinc"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/69/22369-050-60BA7EE4/Gallium-symbol-Ga-square-periodic-table-some.jpg",
                "Gallium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/68/22368-050-2BF3D7E7/Germanium-symbol-Ge-square-periodic-table-some.jpg",
                "Germanium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/67/22367-050-98CB03AE/Arsenic-symbol-square-periodic-table-some-properties.jpg",
                "Arsenic"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/66/22366-050-1BD90744/Selenium-symbol-Se-square-periodic-table-some.jpg",
                "Selenium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/65/22365-050-026D4EDD/Bromine-symbol-square-Br-properties-some-periodic.jpg",
                "Bromine"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/64/22364-050-37D5BBD8/Krypton-krypton-symbol-square-properties-some-periodic.jpg",
                "Krypton"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/63/22363-050-1FAB359B/Rubidium-rubidium-symbol-square-properties-some-periodic.jpg",
                "Rubidium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/62/22362-050-278DC922/Strontium-alkaline-earth-metal-symbol-square-Sr.jpg",
                "Strontium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/61/22361-050-BE9CF848/Yttrium-symbol-square-Y-properties-some-periodic.jpg",
                "Yttrium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/60/22360-050-EB75A50E/Zirconium-zirconium-Zr-square-properties-some-periodic.jpg",
                "Zirconium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/59/22359-050-715B20E2/Niobium-niobium-symbol-square-Nb-properties-some.jpg",
                "Niobium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/58/22358-050-A63CB4E2/Molybdenum-molybdenum-symbol-square-Mo-properties-some.jpg",
                "Molybdenum"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/57/22357-050-FDA2B3B7/Technetiumm-symbol-Tc-square-periodic-table-some.jpg",
                "Technetium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/56/22356-050-68DE4659/Ruthenium-ruthenium-symbol-square-Ru-properties-some.jpg",
                "Ruthenium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/55/22355-050-780E317E/Rhodium-rhodium-symbol-square-Rh-properties-some.jpg",
                "Rhodium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/54/22354-050-0AB81B56/Palladium-palladium-symbol-square-Pd-properties-some.jpg",
                "Palladium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/53/22353-050-943F7AE0/element-silver-Silver-symbol-square-properties-some.jpg",
                "Silver"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/52/22352-050-5D829FCB/Cadmium-cadmium-symbol-square-Cd-properties-some.jpg",
                "Cadmium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/51/22351-050-69E4B937/element-indium-symbol-square-In-properties-some.jpg",
                "Indium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/50/22350-050-E7CDE182/Tin-symbol-square-periodic-table-some-properties.jpg",
                "Tin"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/49/22349-050-148109EB/Antimony-antimony-symbol-square-Sb-properties-some.jpg",
                "Antimony"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/48/22348-050-0CAC2E64/Tellerium-Te-square-periodic-table-some-properties.jpg",
                "Tellurium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/47/22347-050-3CE5D54C/element-square-symbol-periodic-table-some-properties.jpg",
                "Iodine"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/46/22346-050-A721EE5B/Xenon-xenon-symbol-square-properties-some-periodic.jpg",
                "Xenon"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/45/22345-050-5A661087/Cesium-symbol-square-periodic-table-some-properties.jpg",
                "Cesium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/44/22344-050-65A1908B/Barium-symbol-square-periodic-table-some-properties.jpg",
                "Barium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/43/22343-050-FEC958A8/Lanthanum-symbol-La-square-periodic-table-some.jpg",
                "Lanthanum"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/28/22328-050-CFFD7CE8/Hafnium-square-periodic-table-some-properties-atomic.jpg",
                "Hafnium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/27/22327-050-2914AB1C/Tantalum-symbol-Ta-square-periodic-table-some.jpg",
                "Tantalum"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/26/22326-050-3A1E451A/Tungsten-square-symbol-some-periodic-table-properties.jpg",
                "Tungsten"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/25/22325-050-1D5E6209/Rhenium-symbol-Re-square-periodic-table-some.jpg",
                "Rhenium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/24/22324-050-A627D17D/Osmium-square-periodic-table-some-properties-atomic.jpg",
                "Osmium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/23/22323-050-081BE57A/Iridium-element-symbol-square-periodic-table-some.jpg",
                "Iridium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/22/22322-050-24BD661A/element-symbol-Pt-square-periodic-table-some.jpg",
                "Platinum"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/21/22321-050-D8576AD9/element-symbol-square-Au-periodic-table-some.jpg",
                "Gold"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/20/22320-050-119E2549/Mercury-element-square-periodic-table-some-properties.jpg",
                "Mercury"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/19/22319-050-9483B8D6/Thallium-Tl-square-periodic-table-some-properties.jpg",
                "Thallium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/18/22318-050-B9CD67E5/element-symbol-Pb-square-periodic-table-some.jpg",
                "Lead"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/17/22317-050-A4521D8F/Bismuth-square-periodic-table-some-properties-atomic.jpg",
                "Bismuth"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/16/22316-050-ABD0CA06/Polonium-symbol-Po-square-periodic-table-some.jpg",
                "Polonium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/15/22315-050-8169FAE5/Astatine-symbol-At-square-periodic-table-some.jpg",
                "Astatine"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/14/22314-050-04B2DD0D/element-radon-symbol-square-Rn-properties-some.jpg",
                "Radon"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/13/22313-050-E1CDC99D/Francium-alkali-metal-symbol-square-properties-some.jpg",
                "Francium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/12/22312-050-F0912079/properties-Radium.jpg",
                "Radium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/11/22311-050-680BFFE0/Actinium.jpg",
                "Actinium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/96/22296-050-901AAAE8/Rutherfordium.jpg",
                "Rutherfordium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/95/22295-050-4BC417DD/Dubnium.jpg",
                "Dubnium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/94/22294-050-77F9A394/Seaborgium.jpg",
                "Seaborgium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/93/22293-050-A3DEBD27/Bohrium.jpg",
                "Bohrium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/92/22292-050-F89497DA/Hassium.jpg",
                "Hassium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/91/22291-050-79744ACA/Meitnerium.jpg",
                "Meitnerium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/90/22290-050-33C9E16F/Darmstadtium.jpg",
                "Darmstadtium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/89/22289-050-B70AC8A7/Roentgenium.jpg",
                "Roentgenium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/88/22288-050-510E4788/Copernicium.jpg",
                "Copernicium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/37/91737-050-3D1C3D2B/properties-element-part-nihonium-imagemap-Periodic-Table.jpg",
                "Nihonium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/39/91739-050-7108CF45/properties-flerovium-part-imagemap-Periodic-Table-of.jpg",
                "Flerovium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/40/91740-050-51A3463D/properties-element-part-moscovium-imagemap-Periodic-Table.jpg",
                "Moscovium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/41/91741-050-9E7B9002/properties-livermorium-part-imagemap-Periodic-Table-of.jpg",
                "Livermorium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/49/138649-050-1DF7C2EE/properties-element-part-imagemap-Periodic-Table-of.jpg",
                "Tennessine"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/93/128693-050-7BCBAC9B/properties-element-part-imagemap-Periodic-Table-of.jpg",
                "Oganesson"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/42/22342-050-C5DCDD12/element-Ce-square-periodic-table-some-properties.jpg",
                "Cerium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/41/22341-050-0BE80FFA/Praseodymium-symbol-Pr-square-periodic-table-some.jpg",
                "Praseodymium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/40/22340-050-360E0542/Neodymium-symbol-Nd-square-periodic-table-some.jpg",
                "Neodymium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/39/22339-050-F863032D/Promethium-symbol-Pm-square-periodic-table-some.jpg",
                "Promethium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/38/22338-050-BFFF0FC9/Samarium-element-symbol-Sm-square-periodic-table.jpg",
                "Samarium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/37/22337-050-B22D85A3/Europium-symbol-Eu-square-periodic-table-some.jpg",
                "Europium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/36/22336-050-E3CEE8C0/Gadolinium-symbol-square-periodic-table-some-properties.jpg",
                "Gadolinium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/35/22335-050-3AA3278E/Terbium-symbol-Tb-square-periodic-table-some.jpg",
                "Terbium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/34/22334-050-01807FA2/Dysprosium-symbol-Dy-square-periodic-table-some.jpg",
                "Dysprosium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/33/22333-050-A600FA9A/Holmium-symbol-Ho-square-periodic-table-some.jpg",
                "Holmium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/32/22332-050-0D797FF3/Erbium-symbol-square-periodic-table-some-properties.jpg",
                "Erbium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/31/22331-050-0FAD4634/Thulium-symbol-Tm-square-periodic-table-some.jpg",
                "Thulium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/30/22330-050-1492024E/Ytterbium-symbol-square-periodic-table-some-properties.jpg",
                "Ytterbium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/29/22329-050-FC45A9BB/Lutetium-symbol-Lu-square-periodic-table-some.jpg",
                "Lutetium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/10/22310-050-74745E38/Thorium.jpg",
                "Thorium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/09/22309-050-C8E27D92/Protactinium.jpg",
                "Protactinium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/08/22308-050-A62D6D78/properties-Uranium.jpg",
                "Uranium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/07/22307-050-310AF520/Neptunium.jpg",
                "Neptunium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/06/22306-050-B176AB3D/Plutonium.jpg",
                "Plutonium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/05/22305-050-66C49B13/Americium.jpg",
                "Americium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/04/22304-050-36BA8452/Curium.jpg",
                "Curium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/03/22303-050-F48CBC6E/Berkelium.jpg",
                "Berkelium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/02/22302-050-8E792B1F/Californium.jpg",
                "Californium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/01/22301-050-AB46F4FC/properties-Einsteinium.jpg",
                "Einsteinium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/00/22300-050-CFE6959E/properties-Fermium.jpg",
                "Fermium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/99/22299-050-139CF0BA/Mendelevium.jpg",
                "Mendelevium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/98/22298-050-A29636A6/properties-Nobelium.jpg",
                "Nobelium"
            ));

            locationImageRepository.save(new ImageLocation(
                "https://cdn.britannica.com/97/22297-050-0B262E16/Lawrencium.jpg",
                "Lawrencium"
            ));
        }
    }
}

