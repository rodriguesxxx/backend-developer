use cadastro;
desc gafanhotos;
select g.nome,
    c.nome,
    c.ano
from gafanhotos as g
    inner join cursos as c on c.idcurso = g.cursopreferido;