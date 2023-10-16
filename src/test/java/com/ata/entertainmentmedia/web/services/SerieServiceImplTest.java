package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.web.repos.SerieRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class) //inits mocks etc.
class SerieServiceImplTest {

    @Mock
    private SerieRepo repo;
    @Mock
    private SerieService underTestInteface;

    @InjectMocks
    private SerieServiceImpl underTest;

    @Test
    public void testGetAllSeries() {
        // when
        underTest.getAllSeries();

        // then
        verify(repo).findAll();
    }

    @Test
    public void testGetSerieById() {
        // when
        Long serieId = 1L;
        given(underTest.getSerieById(serieId))
                .willReturn()
    }


  /*  @InjectMocks
    private SerieServiceImpl serieService;

    @Mock
    SerieRepo serieRepo;

    @Mock
    UpdateSerieMapper updateSerieMapper;

    @BeforeEach
    void setUp() {
        // Initialize Mockito annotations
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllSeries() {

        //  Setup
        List<Serie> expectedSeries = new ArrayList<>();
        when(serieRepo.findAll()).thenReturn(expectedSeries);

        //  Actual method called
        List<Serie> actualSeries = serieService.getAllSeries();

        //  Assert
        assertEquals(expectedSeries, actualSeries);
    }

    @Test
    public void testGetSerieById() {

        //  Setup
        Long id = 1L;
        Serie expectedSerie = new Serie();
        when(serieRepo.findById(id)).thenReturn(Optional.of(expectedSerie));

        //  Actual method called
        Serie actualSerie = serieService.getSerieById(id);

        //  Assert
        assertEquals(expectedSerie, actualSerie);
    }

    // exception test of above method for NoSuchSerieIdException
    @Test
    public void testGetSerieById_ThrowsException() {
        //  Setup
        Long serieId = 1L;
        when(serieRepo.findById(serieId)).thenReturn(Optional.empty());

        //  Assert
        assertThrows(NoSuchSerieIdException.class, () -> serieService.getSerieById(serieId));
    }

    @Test
    public void saveSerie() {

        //  Setup
        Serie expectedSerie = new Serie();
        when(serieRepo.save(expectedSerie)).thenReturn(expectedSerie);

        //  Actual method called
        Serie actualSerie = serieService.saveSerie(expectedSerie);

        //  Assert
        assertEquals(expectedSerie, actualSerie);

    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    *//*@Test
    public void testUpdateSerie() throws NoSuchSerieIdException {

        //  Setup
        SerieDTO serieDTO = new SerieDTO();
        Long id = 1L;
        Serie expectedSerie = new Serie();

        //when(serieService.getSerieById(id)).thenReturn(expectedSerie);
        doNothing().when(updateSerieMapper).updateSerieFromDTO(serieDTO, expectedSerie);
        when(serieService.saveSerie(expectedSerie)).thenReturn(expectedSerie);


        //  Actual Method Called
        exception.expect(NoSuchSerieIdException.class);
        Serie actualSerie = serieService.updateSerie(serieDTO, id);

        //  Assert
        assertEquals(expectedSerie, actualSerie);
    }

    @Test
    public void testUpdateSerie_ThrowsException() {

        //  Setup
        Long serieId = 1L;
        when(serieRepo.findById(serieId)).thenReturn(Optional.empty());

        //  Assert
        assertThrows(NoSuchSerieIdException.class, () -> serieService.getSerieById(serieId));
    }*//*
*/
    
}