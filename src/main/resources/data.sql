-- Wstaw dane do tabeli CABLE_DATA
INSERT INTO CABLE_DATA (ID, CABLE_TYPE, CIRCUIT, INSTALLATION_METHOD, NUMBER_OF_CORES, NUMBER_OF_CORES_LOADED, REFERENCE_METHOD)
VALUES (1, 'YKY 0,6/1kV', '1 fazowy', 'kabel wielożyłowy bezpośrednio w gruncie', 3, 2, 'D2');

-- Wstaw dane do tabeli CONDUCTOR_CROSS_SECTION z użyciem ustawionego identyfikatora
INSERT INTO CONDUCTOR_CROSS_SECTION (ID, CURRENT_CAPACITY, VALUE, CABLE_DATA_ID)
VALUES
    (1, 33, 1.5, 1),
    (2, 42, 2.5, 1),
    (3, 57, 4.0, 1),
    (4, 72, 6.0, 1),
    (5, 96, 10.0, 1),
    (6, 124, 16.0, 1),
    (7, 165, 25.0, 1),
    (8, 198, 35.0, 1),
    (9, 234, 50.0, 1),
    (10, 288, 70.0, 1),
    (11, 345, 95.0, 1),
    (12, 391, 120.0, 1),
    (13, 439, 150.0, 1),
    (14, 496, 185.0, 1),
    (15, 573, 240.0, 1),
    (16, 640, 300.0, 1);