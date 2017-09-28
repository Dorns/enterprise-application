using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Web;
using ProjetoFinalMVC.Models;
using ProjetoFinalMVC.Persistencia;
using System.Data.Entity;

namespace ProjetoFinalMVC.Repositories
{
    public class FuncionarioRepository : IFuncionarioRepository
    {
        private EmpresarialContext _context;

        public FuncionarioRepository(EmpresarialContext context)
        {
            _context = context;
        }

        public void Alterar(Funcionario funcionario)
        {
            _context.Entry(funcionario).State = EntityState.Modified;
        }

        public Funcionario Buscar(int id)
        {
            return _context.Funcionarios.Find(id);
        }

        public List<Funcionario> BuscarPor(Expression<Func<Funcionario, bool>> filtro)
        {
            return _context.Funcionarios.Include("Empresa").Where(filtro).ToList();
        }

        public void Cadastrar(Funcionario funcionario)
        {
            _context.Funcionarios.Add(funcionario);
        }

        public List<Funcionario> Listar()
        {
            return _context.Funcionarios.Include("Empresa").ToList();
        }

        public void Remover(int id)
        {
            _context.Funcionarios.Remove(Buscar(id));
        }
    }
}