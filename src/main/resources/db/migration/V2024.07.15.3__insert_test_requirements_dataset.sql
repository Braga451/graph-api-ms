-- Requisitos para 'Algoritmos e Estruturas de Dados II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (7, 1);

-- Requisitos para 'Arquitetura de Computadores I'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (8, 1);

-- Requisitos para 'Bancos de Dados'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (9, 1);

-- Requisitos para 'Trab. Interdisciplinar II: BD e S. Inteligentes'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (12, 7),
       (12, 9);

-- Requisitos para 'Algoritmos e Estruturas de Dados III'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (13, 7);

-- Requisitos para 'Arquitetura de Computadores II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (14, 8);

-- Requisitos para 'Cálculo II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (15, 2);

-- Requisitos para 'Engenharia de Software I'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (16, 7),
       (16, 12);

-- Requisitos para 'Linguagens de Programação'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (17, 7);

-- Requisitos para 'Trab. Interdisciplinar III: Pesquisa Aplicada'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (18, 7),
       (18, 12);

-- Requisitos para 'Estatística e Probabilidade'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (19, 2);

-- Requisitos para 'Inteligência Artificial'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (20, 19),
       (20, 25);

-- Requisitos para 'Lab. de Desenvol. para Dispositivos Móveis'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (21, 7);

-- Requisitos para 'Modelagem e Avaliação de Desempenho'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (22, 19),
       (22, 25);

-- Requisitos para 'Teoria dos Grafos e Computabilidade'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (24, 7);

-- Requisitos para 'Trab. Interdisciplinar IV: Aplicações Móveis'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (25, 20),
       (25, 21);

-- Requisitos para 'Arquitetura de Computadores III'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (26, 14);

-- Requisitos para 'Engenharia de Software II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (27, 16);

-- Requisitos para 'Projeto e Análise de Algoritmos'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (29, 24),
       (29, 19);

-- Requisitos para 'Redes de Computadores I'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (30, 24);

-- Requisitos para 'Sistemas Operacionais'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (31, 7),
       (31, 14);

-- Requisitos para 'Trab. Interdisciplinar V: Sist. Computacionais'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (32, 30),
       (32, 26),
       (32, 31);

-- Requisitos para 'Computação Distribuída'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (33, 30);

-- Requisitos para 'Computação Paralela'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (34, 13),
       (34, 26);

-- Requisitos para 'Fundamentos Teóricos da Computação'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (36, 24);

-- Requisitos para 'Processamento e Análise de Imagens'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (38, 29);

-- Requisitos para 'Trab. Interdisciplinar VI: Sist. Paral. e Distrib.'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (39, 34),
       (39, 33);

-- Requisitos para 'Compiladores'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (40, 36),
       (40, 14);

-- Requisitos para 'Computação Gráfica'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (41, 7),
       (41, 35);

-- Requisitos para 'Redes de Computadores II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (44, 30);

-- Requisitos para 'Tópicos em Computação I'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (45, 29);

-- Requisitos para 'Tópicos em Computação II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (46, 29);

-- Requisitos para 'Tópicos em Computação III'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (47, 29);

-- Requisitos para 'Trabalho de Conclusão de Curso I'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (48, 29);

-- Requisitos para 'Otimização de Sistemas'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (53, 24),
       (53, 35);

-- Requisitos para 'Segurança e Auditoria de Sistemas'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (54, 27);

-- Requisitos para 'Trabalho de Conclusão de Curso II'
INSERT INTO requirements (subject_id, dependency_id)
VALUES (55, 48);