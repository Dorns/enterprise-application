using Fiap.Revisao.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.Revisao.Repositories
{
    public interface IFuncionarioRepository
    {
        void Cadastrar(Funcionario funcionario);
        List<Funcionario> Listar();
        void Remover(int id);
        List<Funcionario> BuscarPor(Expression<Func<Funcionario, bool>> filtro);
        Funcionario Buscar(int id);
    }
}
