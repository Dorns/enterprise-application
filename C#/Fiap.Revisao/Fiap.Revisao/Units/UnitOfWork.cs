using Fiap.Revisao.Persistencia;
using Fiap.Revisao.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Fiap.Revisao.Units
{
    public class UnitOfWork : IDisposable
    {
        private EmpresarialContext _context = new EmpresarialContext();
        private IEmpresaRepository _empresaRepository;
        private IFuncionarioRepository _funcionarioRepository;

        public IEmpresaRepository EmpresaRepository
        {
            get
            { 
                if(_empresaRepository == null)
                {
                    _empresaRepository = new EmpresaRepository(_context);
                }
                return _empresaRepository;
            }
        }

        public IFuncionarioRepository FuncionarioRepository
        {
            get
            {
                if(_funcionarioRepository == null)
                {
                    _funcionarioRepository = new FuncionarioRepository(_context);
                }
                return _funcionarioRepository;
            } 
        }

        public void Salvar()
        {
            _context.SaveChanges();
        }

        public void Dispose()
        {
           if(_context != null)
           {
                _context.Dispose();
           }
           GC.SuppressFinalize(this);
        }
    }
}