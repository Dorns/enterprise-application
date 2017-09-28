using ProjetoFinalMVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace ProjetoFinalMVC.Repositories
{
    public interface IFuncionarioRepository
    {
        void Cadastrar(Funcionario funcionario);
        void Alterar(Funcionario funcionario);
        void Remover(int id);
        List<Funcionario> Listar();
        List<Funcionario> BuscarPor(Expression<Func<Funcionario,bool>> filtro);
        Funcionario Buscar(int id);
    }
}
